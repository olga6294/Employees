CREATE TABLE Employee (
    id int identity(1,1) primary key,
    name varchar(50) not null,
    salary double,
    dateOfEmployment date
);

CREATE TABLE Team (
    id int identity(1,1) primary key,
    name varchar(50) not null
);

CREATE TABLE TeamAssignment (
    employeeId int,
    teamId int,
    constraint unique_employee_team_id unique(employeeId, teamId)
);

