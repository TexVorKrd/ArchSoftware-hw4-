# Описание проекта
##UI

У пользователей есть возможность формировать отчеты в графической части UI.
Предполагается что используется принцип SSA и за графическое построение отвечает UI.

Описание UX:
- Пользователь выбирает отчет из фиксированного списка (дроп бокса). Шаблоны отчетов разрабатываются исходя из
потребностей заказчика.
Например (Складские остатки, поступление ДС, отгрузки, задолженость покупателей)
- После выбора отчетов формируется список фильтров подходящих для конкретного вида отчета.
К примеру для того чтобы посмотреть складские остатки по товару достаточно использовать товар или группу товара.
Для задолжености - контрагента, для оборота за териод - начало и конец периода. Данные о фильтрах загружаются из БД 
и визуализируются  на стороне пользователя в зависимости от состава и содержания.
- После  настройки фильтров и нажатии  кнопки сформировать, запрашиваются данные и визуализируется 
отчет.
----
##ERD

Описана структура хранения данных. Связки организованы через FK.
Данные включают два блока 
- Данные о хозяйственной деятельности
- Даннтые отчетах

---
##UML

Сформирован автоматически IJ: 

- слой данных Model повторяет поля БД и репозиторий с реализацией интерфейса подключения. а так же получение данных о фильтрах
- сервисная часть описавает извлечение данных из БД с учетом данных фильтров и маски фильтра,
а так же логику их обработки и конвертации в нужный формат для отправки в UI
- Слой контролера предполагает обработку запрос/ответ из UI по фильтрам и данным.




