create table Users (
	id serial primary key,
	username varchar(250) not null
	);
	

create table Questions(
	id serial primary key,
	question text not null
);

create table Answers(
	id serial primary key,
	questionId smallint,
	answer text,
	foreign key (questionID) references Questions(id)
);

create table CheckQuestion(
	id serial primary key,
	questionID smallint not null,
	answerID smallint not null,
	foreign key (questionID) references Questions(id),
	foreign key (answerID) references Answers(id)
);

create table Results(
	id serial primary key,
	userID smallint not null,
	result smallint not null,
	data timestamp not null,
	foreign key (userID) references Users(id)
)

create table TestResults(
	id serial primary key,
	userID smallint not null,
	resultID smallint not null,
	questionID smallint not null,
	answerID smallint not null,
	test boolean not null,
	foreign key (userID) references Users(id),
	foreign key (resultID) references Results(id),
	foreign key (questionID) references Questions(id),
	foreign key (answerID) references Answers(id)
)
