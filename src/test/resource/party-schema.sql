create table user(
  user_id int not null auto_increment,
  name varchar(80) null,
  email varchar(80) unique,
  password varchar(80) null,
  sex int not null,
  primary key(user_id)
  )

create table function(
    function_id int not null auto_increment,
    name varchar(80) null,
    introduction varchar(300) null,
    address varchar(80) null,
    fuction_type varchar(80),
    deadline date null,
    startTime date null，
    primary key(function_id)
)

create table user_function(
   id int not null auto_increment,
   user_id int not null,
   function_id int not null ,
   primary key(id),
   foreign key(user_id) references 'user'('user_id'),
   foreign key(function_id) references 'function'('function_id')
   )