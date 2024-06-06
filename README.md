Калькулятор на Spring Boot

Описание проекта:

В этом проекте был создан простой калькулятор на языке Java с использованием фреймворка Spring Boot. Калькулятор имеет два метода: сложение и вычитание, которые принимают два аргумента типа Integer и возвращают их сумму или разность соответственно.

Функциональность:

1)http://localhost:8080/api/v1/plus/{a}/{b} - метод plus принимает два аргумента a и b и возвращает их сумму.

2)http://localhost:8080/api/v1/minus/{a}/{b} - метод minus принимает два аргумента a и b и возвращает их разность.

3)Результаты расчетов сохраняются в in-memory БД.

4)http://localhost:8080/api/v1/results - добавлена API для получения всех сохраненных записей в БД.


Технологии:

-Spring Boot 3.0.0

-Java 17

-Swagger для генерации веб-интерфейса для API(SwaggerServer->openapi-client-generated->openapi.json)

-In-memory БД для хранения результатов расчетов


Скриншоты работы:

Minus:

![image](https://github.com/Andrey999r/JvaCalculator/assets/117219416/de8f579c-a857-4353-bd84-38239240ff9f)

Plus:

![image](https://github.com/Andrey999r/JvaCalculator/assets/117219416/2360817a-c95c-43b2-8462-4b572f33d81a)

Results:

![image](https://github.com/Andrey999r/JvaCalculator/assets/117219416/6e4bf4e5-0abd-40df-8d5d-c3ec4efb8976)



Swagger - Plus:

![image](https://github.com/Andrey999r/JvaCalculator/assets/117219416/607bce39-268a-48e9-b2bc-6e00c35e24eb)

Swagger - Minus:

![image](https://github.com/Andrey999r/JvaCalculator/assets/117219416/c8febc03-2f5a-4c83-9ecc-8f73d50518da)






Автор:

Кустов Андрей Андреевич
