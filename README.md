Самостоятельный проект "Библиотека"

Проект "Библиотека" предназначена для работников и пользователей библиотеки.

Приложение оптимизирует работу библиотеки:
- у пользователей будет возможность просматривать книги, которые есть в бибилотеке в режиме онлайн по разделам: жанры, авторы, все доступные книги на данный момент
- в личном кабинете для пользователя будет доступна информация о том, какие книги у него в бронировании на данный момент. А так же, будет счетчик дней до возврата забронированной книги
- выдача книг будет фиксироваться в приложении
- возврат книг будет фиксироваться в приложении
- библиотекарь сможет добавлять или удалять книги по мере их завоза/архивации в приложении
- библиотекарь будет видеть книги, срок возврата которых будет просрочен. Для таких случаев у библиотекаря будет доступ к телефонам пользователей библиотеки, для напоминания срока возврата книги

Реализованные фичи (будут дополняться по мере доработки проекта):

Зарегистрированный пользователь:

- Просмотр всех книг, которые есть в библиотеке на данный момент
- Просмотр всех авторов, книги которых есть в библиотеке
- Просмотр книг, которые написал опеределенный автор

Использованные технологии: Java 11, Maven, Tomcat, Liquibase, Hibernate, JDBC, Spring Core, Spring MVC, Spring Security, PostgreSQL, Lombok, HTML, Thymeleaf.

Приложение устанавливается на Tomcat, разворачивается в контекстном пути http://localhost:8082/library.

Разворачивание приложения:

1. Скопировать ссылку на репозиторий 
2. Создать проект при помощи экспорта репозитория
3. В базе данных PostgreSQL создать тестовую бд для создания и заполнения таблиц при промощи Liquibase
4. Добавить данные в файл application.properties:

- spring.datasource.url=jdbc:postgresql://localhost:5432/название_тестовой_таблицы
- spring.datasource.username=пользователь БД
- spring.datasource.password=пароль пользователя

6. Запустить приложение
7. После запуска приложения для просмотра доступны функции просмотра страниц:

- домашняя страница: http://localhost:8082/home
- просмотр всех авторов, книги которых есть в библиотеке: http://localhost:8082/authors/all
- просмотр автора по id (на данный момент в бд добавлен 1 автор) : http://localhost:8082/authors/id
- просмотр всех книг, которые есть в библиотеке на данный момент: http://localhost:8082/books/all
- просмотр книги по id (на данный момент в бд добавлена 1 книга) : http://localhost:8082/books/id
- просмотр всех жанров книг, доступных в бибилотеке http://localhost:8082/genres/all