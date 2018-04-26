drop table Ingredients cascade constraints;
drop table RecipeIngredients cascade constraints;
drop table Recipe cascade constraints;
drop table MealPlan cascade constraints;
drop table MealPlanRecipe cascade constraints;
drop sequence seq_recipe;
drop sequence seq_mealplan;

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
RecipeID int primary key,
Category varchar2(20),
Instruction varchar2(60),
Name varchar2(20)
);

create table RecipeIngredients (
IngredientsName varchar2(20),
RecipeID int,
Qty number,
constraint ingred foreign key (IngredientsName) references Ingredients(Name),
constraint recip foreign key (RecipeID) references Recipe(RecipeID)
);
/* check this for accuracy */
create table MealPlan(
MealID int primary key,
DayOfWeek varchar2(20) 
);

create table MealPlanRecipe(
RecipeID int,
MealID int,
Meal varchar2(20),
constraint  incRecipe foreign key (RecipeID) references Recipe(RecipeID),
constraint incMeal foreign key (MealID) references MealPlan(MealID)
);
CREATE SEQUENCE seq_recipe
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;
CREATE SEQUENCE seq_mealplan
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;
