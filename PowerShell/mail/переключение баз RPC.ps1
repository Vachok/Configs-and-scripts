ImportSystemModules
Get-MailboxDatabaseCopyStatus | fl # статус

Get-MailboxDatabase | Set-MailboxDatabase -RpcClientAccessServer "srv-mail3.eatmeat.ru" # жестко на m3
#Get-MailboxDatabase | Set-MailboxDatabase -RpcClientAccessServer "srv-mail4.eatmeat.ru" # жестко на m4
