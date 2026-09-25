# Write your MySQL query statement below
select product_name, year, price from Sales as sl
Inner join Product as pd
ON sl.product_id = pd.product_id;