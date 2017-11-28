importsystemmodules # Подключаем модули PoShell
Get-Mailbox -identity "Попова, Елена" | Search-Mailbox -TargetMailbox "Янюшкин, Павел" -LogLevel full # Берем Ящик ; Копируем тому, кто спрашивает с полным логом
New-MailboxExportRequest -Mailbox "Попова, Елена" -FilePath "\\192.168.14.10\IT-Backup\Mailboxes_users\e.s.popova.pst" # Выгрузка ящика в pst (Attention! -Filepath не может быть на локальный комп! Только на SMB!)
Disable-Mailbox -identity "Попова, Елена" # Выключаем ящик , помечаем на удаление
Get-MailboxDatabase | Clean-MailboxDatabase # Физически чистим БД



### Параметры для поиска, отбора и/или удаления
#-SearchQuery 'sent:10/30/2017 ' #| select  
#-DeleteContent -Force -LogLevel full
# and sent:<08/01/2017



#Foreach ($i in (Get-Mailbox -OrganizationalUnit _disabled_users)) # Если нужна массовая выгрузка