### Это мой вариант выполнения итоговой работы по блоку специализации от GB.

#### Структура каталогов:
1. final_paper_bash включает в себя:
    * PDF файл с последоввательным решением 1-12 заданий
    * Папку assets со всеми файлами решения 1-12 заданий сформированными в единный PDF
2. Файл 'Итоговая контральная работа.pdf' со всеми заданиями
3. src часть заданий с программной реализацией:
    * model:
        * animal:
          1. pack_animal - пакет потомков, PackAnimal.java
          2. pet - пакет потомков, Pet.java(Cat.java, Dog.java, Hamster.java)
          3. PackAnimal.java - наследник Animal.java (оставлен для примера возможного расширения)
          4. Pet.java - наследник Animal.java
        * Animal.java - абстрактный родительский класс
        * Counter.java - класс счетчик
        * Model.java - управляющий класс пакета model
    * presenter - содержит единственный класс Presenter(взаимодействующий с Model и View)
    * view:
        * View.java - абстрактный класс для взаимодействия с пользователем
        * Console.java - потомок View для работы через консоль
    * Main.java - точка запуска консольного приложения

#### Номера всех assets соответствуют номерам заданий.