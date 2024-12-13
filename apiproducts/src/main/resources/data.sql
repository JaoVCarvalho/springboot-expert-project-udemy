create table product(
    id bigint not null primary key,
    name varchar(255) not null,
    description varchar (255),
    price numeric(18, 2)
);