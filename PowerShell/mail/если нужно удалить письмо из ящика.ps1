importsystemmodules # Подключаем модули PoShell
Get-Mailbox -identity "Филистова, Екатерина" | Search-Mailbox -TargetMailbox "Филистова, Екатерина" -SearchQuery 'sent:11/02/2017 ' -LogLevel full # Берем Ящик "х" ; Копируем в "у", у Мутных удаляем :) да ещё и с логом.

# Описание командлета https://technet.microsoft.com/ru-ru/library/dd298173(v=exchg.141).aspx
# Описание поисковых запросов -SearchQuery https://technet.microsoft.com/ru-ru/library/bb232132(v=exchg.141).aspx#AQS 