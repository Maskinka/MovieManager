Вам необходимо реализовать менеджер Афиши для фильмов. В качестве объекта фильма можно взять объект строки (название фильма) или создать свой дата-класс.
В этой задаче не нужно разделять менеджер и репозиторий - все фильмы должны храниться внутри массива в поле самого менеджера. Изначально, сразу после создания, менеджер не должен содержать фильмов. 

Менеджер должен уметь выполнять следующие операции:
1. Добавление нового фильма.
2. Вывод всех фильмов в порядке добавления (`findAll`)
3. Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядке (`findLast`)

*Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 5 (а не 10). Т.е. у вас у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 10, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

Создайте новую ветку `layers`, в которой разделите менеджера на менеджера и репозиторий.
В репозитории должны быть следующие методы:
1. `findAll` - возвращает массив всех хранящихся в массиве объектов
1. `save` - добавляет объект в массив
1. `findById` - возвращает объект по идентификатору (либо `null`, если такого объекта нет)
1. `removeById` - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
1. `removeAll`* - полностью вычищает репозиторий (для удаления всех элементов достаточно в поле `items` положить пустой массив)

Обеспечьте использование менеджером созданного вами репозитория (новых функций в менеджер по сравнению с первым заданием добавлять не нужно). Репозиторий должен быть зависимостью для менеджера (т.е. задаваться через конструктор и храниться в приватном поле).

Напишите 1-2 автотеста, используя Mockito для организации моков репозитория.
