RU text
Ваша задача на сегодня: написать простую версию калькулятора и покрыть её тестами.
Следуйте инструкции ниже, чтобы справиться с заданием.
Этап 1: создание калькулятора
Шаг 1
Создать Spring Boot проект calculator.
Шаг 2
Подключить модуль Spring Web при создании.
Шаг 3
Написать 5 методов, которые при вызове из браузера делают следующее:
 Метод по адресу /calculator должен вернуть приветствие "Добро пожаловать в калькулятор".
 Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате "5 + 5 = 10".
 Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате "5 − 5 = 0".
 Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате "5 * 5 = 25".
 Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате "5 / 5 = 1".
При выполнении задания важно учесть
🖊️ /calculator повторяется. Рекомендуется использовать @RequestMapping на уровне контроллера.
🖊️ Деление на 0 в Java выкидывает ошибку.
🖊️ Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
🖊️ Контроллер не должен вычислять результат, а только делегировать его вычисление сервису. После получения от него результата, контроллер должен сформировать строку и вернуть пользователю в браузер.
Этап 2: покрытие кода тестами
Перед добавлением зависимостей проверьте, что в вашем проекте (pom.xml) отсутствует зависимость 
spring-boot-starter-test.
Если эта зависимость присутствует в вашем проекте (добавляется автоматически при генерации Spring-проекта), то отдельно подключать JUnit не требуется.
Шаг 1. Доработать метод деления.
Теперь, в случае передачи в качестве второго параметра числа 0, нужно выбрасывать исключение своего наследника IllegalArgumentException из метода калькулятора с соответствующим текстом ошибки. Использовать для проверки параметра контроллер больше нельзя.
Шаг 2. Создать тестовый класс и написать в нем тесты для всех методов калькулятора. По 2 набора параметров на каждый.
На метод деления написать дополнительный тест с проверкой выбрасывания исключения.
Шаг 3. Создать тестовый класс и написать в нем параметризованные тесты для методов калькулятора.
Учтите, что может потребоваться написать 4 параметризованных теста и один или несколько методов с набором аргументов. Тест на исключение дублировать не надо.
💡 Начиная с данного задания вам обязательно нужно покрывать тестами весь написанный вами код, даже если в условии задания этого не прописано. Это обязательное требование к работе на коммерческих проектах, которое не всегда прописывают в техническом задании.

ENG text
Your task for today is to write a simple version of the calculator and cover it with tests.
Follow the instructions below to complete the task.
Step 1: Creating a calculator
Step 1
Create a Spring Boot calculator project.
Step 2
Connect the Spring Web module when creating.
Step 3
Write 5 methods that, when called from the browser, do the following:
The method at /calculator should return the greeting "Welcome to the calculator".
 The method at /calculator/plus?num1=5&num2=5 should add num1 and num2 and return the result in the format "5 + 5 = 10".
 The method at /calculator/minus?num1=5&num2=5 should subtract num2 from num1 and return the result in the format "5 − 5 = 0".
 The method at /calculator/multiply?num1=5&num2=5 should multiply num1 by num2 and return the result in the format "5 * 5 = 25".
The method at /calculator/divide?num1=5&num2=5 should divide num1 by num2 and return the result in the format "5 / 5 = 1".
When completing a task, it is important to take into account
🖊️ /calculator repeats. It is recommended to use @RequestMapping at the controller level.
🖊️Dividing by 0 in Java throws an error.
🖊️If any of the two parameters (or both) are not supplied, an error must be returned.
🖊️The controller should not calculate the result, but only delegate its calculation to the service. After receiving the result from it, the controller must generate a string and return it to the user in the browser.
Stage 2: Test coverage of the code
Before adding dependencies, check what is in your project (pom.xml ) there is no dependency 
spring-boot-starter-test.
If this dependency is present in your project (it is added automatically when generating a Spring project), then you do not need to connect JUnit separately.
Step 1. Refine the division method.
Now, if the number 0 is passed as the second parameter, you need to throw the exception of your heir IllegalArgumentException from the calculator method with the corresponding error text. You can no longer use the controller to check the parameter.
Step 2. Create a test class and write tests for all calculator methods in it. There are 2 sets of parameters for each.
Write an additional test for the division method to check for throwing an exception.
Step 3. Create a test class and write parameterized tests for calculator methods in it.
Note that you may need to write 4 parameterized tests and one or more methods with a set of arguments. There is no need to duplicate the exclusion test.
Starting from this task, you definitely need to cover all the code you have written with tests, even if this is not specified in the task condition. This is a mandatory requirement for working on commercial projects, which is not always prescribed in the terms of reference.
