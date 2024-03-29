# Самостоятельный проект "Библиотека"

Проект "Библиотека" предназначена для работников и пользователей библиотеки.

Приложение оптимизирует работу библиотеки:

- у пользователей будет возможность просматривать книги, которые есть в бибилотеке в режиме онлайн по разделам: жанры, авторы, все доступные книги на данный момент
- в личном кабинете для пользователя будет доступна информация о том, какие книги у него в бронировании на данный момент. А так же, будет счетчик дней до возврата забронированной книги
- выдача книг будет фиксироваться в приложении
- возврат книг будет фиксироваться в приложении
- библиотекарь сможет добавлять или удалять книги по мере их завоза/архивации в приложении
- библиотекарь будет видеть книги, срок возврата которых будет просрочен. Для таких случаев у библиотекаря будет доступ к телефонам пользователей библиотеки, для напоминания срока возврата книги

## Реализованные фичи (будут дополняться по мере доработки проекта):

Зарегистрированный пользователь:

- Просмотр всех книг, которые есть в библиотеке на данный момент
- Просмотр всех авторов, книги которых есть в библиотеке
- Просмотр книг, которые написал опеределенный автор

Использованные технологии: Java 11, Maven, Tomcat, Liquibase, Hibernate, JDBC, Spring Core, Spring MVC, Spring Security, PostgreSQL, Lombok, HTML, Thymeleaf.


## Настройка приложения


Необходимо:

1. maven:4.0.0-openjdk-17.0.2
2. JDK 17

## Конфигурация:

1. Создать БД в сервере PostgreSQL localhost:5432
   название БД: library
2. В конфигурационном файле src/main/resources/application.properties указать значения параметров подключения:

```
spring.datasource.url: jdbc:postgresql://localhost:5432/library
spring.datasource.username
spring.datasource.password
server.port:
```
## Запуск:

1. Запустить api-модуль BibliApplication при помощи IDEA: Run Configuration

### После запуска приложения для просмотра доступны функции:

- домашняя страница: http://localhost:{port}/home
- просмотр всех авторов, книги которых есть в библиотеке: http://localhost:8082/authors/all
- просмотр автора по id (на данный момент в бд добавлен 1 автор) : http://localhost:8082/authors/id
- просмотр всех книг, которые есть в библиотеке на данный момент: http://localhost:8082/books/all
- просмотр книги по id (на данный момент в бд добавлена 1 книга) : http://localhost:8082/books/id
- просмотр всех жанров книг, доступных в бибилотеке http://localhost:8082/genres/all ,

где {port} = server.port в application.properties
