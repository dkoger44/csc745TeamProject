drop table Ingredients cascade constraints;
drop table RecipeIngredients cascade constraints;
drop table Recipe cascade constraints;
drop table MealPlan cascade constraints;
drop table MealPlanRecipe cascade constraints;

create table Ingredients (
Name varchar2(20) primary key,
Calories varchar2(20),
Fat varchar2(20),
Sodium varchar2(20),
Fgroup varchar2(20),
Proteins varchar2(20),
Sugar varchar2(20)
);

create table Recipe (
RecipeID char(9) primary key,
Category varchar2(20),
Instruction varchar2(60),
Name varchar2(20)
);

create table RecipeIngredients (
IngredientsName varchar2(20),
RecipeID char(9),
Qty number,
constraint ingred foreign key (IngredientsName) references Ingredients(Name),
constraint recip foreign key (RecipeID) references Recipe(RecipeID)
);
/* check this for accuracy */
create table MealPlan(
MealID char(9) primary key,
DayOfWeek varchar2(20) 
);

create table MealPlanRecipe(
RecipeID char(9),
MealID char(9),
Meal varchar2(20),
constraint  incRecipe foreign key (RecipeID) references Recipe(RecipeID),
constraint incMeal foreign key (MealID) references MealPlan(MealID)
);
