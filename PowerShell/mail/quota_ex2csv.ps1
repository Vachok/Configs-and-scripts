ImportSystemModules
Get-Mailbox -ResultSize Unlimited | Get-MailboxStatistics | where {$_.StorageLimitStatus -ne "BelowLimit"} | Select DisplayName,StorageLimitStatus,@{name="TotalItemSize (MB)";expression={[math]::Round(($_.TotalItemSize.Split("(")[1].Split(" ")[0].Replace(",","")/1MB),2)}},@{name="TotalDeletedItemSize (MB)";expression={[math]::Round(($_.TotalDeletedItemSize.Split("(")[1].Split(" ")[0].Replace(",","")/1MB),2)}},ItemCount,DeletedItemCount | Sort "TotalItemSize (MB)" -Descending | Export-CSV "C:\Exceeded Quotas.csv" -NoTypeInformation -Encoding utf8 -Delimiter ";"