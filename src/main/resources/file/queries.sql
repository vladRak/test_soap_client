
-- Сделать запрос, который покажет превысил ли доход сотрудника за год отметку в 100.000.

-- Make query that will show whether the employee’s salary exceeded 100.000 in a year.
SELECT SUM(salary.pay) > 100000 AS my_bool FROM salary WHERE salary.employee_id = ?;


-- Сделать запрос, который выведет сотрудников старше 50 лет у которых
-- зарплата за какой либо месяц прошлого года была меньше 5.000.

-- Make a query that will return employees older than 50 years whose
-- salary was less than 5,000 for any month of last year.
SELECT employee.*
FROM employee
JOIN salary
ON salary.employee_id = employee.id
WHERE employee.age > 50 AND salary.pay < 5000
GROUP BY employee.id;


-- От себя.
-- Если нужно узнать всех сотрудников доход которых превысил за год отметку в 100.000

-- From myself.
-- If we need to know all employees whose salary exceeded 100.000 in a year.
SELECT employee.*
FROM employee
JOIN salary
ON salary.employee_id = employee.id
GROUP BY employee.id
HAVING SUM(salary.pay) > 100000;