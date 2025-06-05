# Write your MySQL query statement below
select Product.product_name,Sales.year , Sales.price from sales as Sales join product as Product on Sales.product_id = Product.product_id;
