select name, bonus from Employee as e
Left join Bonus as b
ON e.empId = b.empID
where b.bonus < 1000 or  b.bonus is null;