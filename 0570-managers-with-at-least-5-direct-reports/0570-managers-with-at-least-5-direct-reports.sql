select e.name
FROM Employee e
JOIN Employee m
    ON e.id = m.managerId
group by e.id, e.name
having count(m.id) >= 5;