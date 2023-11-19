use cdac;
delimiter $$
create procedure details()
begin
declare l_name varchar(40);
declare e_id, m_id, j_id int;
select employee_id,manager_id,job_id, last_name into e_id,m_id,j_id,l_name from employees where last_name='king';
select e_id,m_id,j_id,l_name;
end $$

call details();

delimiter ##
create procedure depdetails()
begin
declare d_name varchar(40);
declare d_id, l_id int;
select department_name,department_id,location_id into d_name,d_id,l_id from departments where location_id=1800;
select d_name,d_id,l_id ;
end ##

call depdetails();
drop procedure depdetails;
