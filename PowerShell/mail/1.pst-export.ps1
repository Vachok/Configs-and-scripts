
ImportSystemModules
Foreach ($i in (Get-Mailbox -OrganizationalUnit _disabled_users)) { New-MailboxExportRequest -Mailbox $i -FilePath "\\192.168.14.10\IT-Backup\Mailboxes_users\$($i.Alias).pst" } 
