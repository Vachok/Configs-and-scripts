ImportSystemModules
Get-MailboxExportRequest -Status failed | Get-MailboxExportRequestStatistics | fl > c:\failedexport.txt
Get-MailboxExportRequest -Status inprogress | Get-MailboxExportRequestStatistics | ft
Get-MailboxExportRequest -Status completed | Get-MailboxExportRequestStatistics | fl > c:\compl.txt
Foreach ($i in (Get-MailboxExportRequest -Status completed)) { Remove-Mailbox -identity $i.mailbox }
Get-MailboxExportRequest -Status completed | Remove-MailboxExportRequest