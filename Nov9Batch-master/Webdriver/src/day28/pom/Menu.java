package day28.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
@FindBy(linkText="Home")
WebElement home;
public void home()
{
	home.click();
}

@FindBy(linkText="Flights")
WebElement Flights;
public void Flights()
{
	Flights.click();
}

@FindBy(linkText="Hotels")
WebElement Hotels;
public void Hotels()
{
	Hotels.click();
}

@FindBy(linkText="Car Rentals")
WebElement CarRentals;
public void CarRentals()
{
	CarRentals.click();
}

@FindBy(linkText="Cruises")
WebElement Cruises;
public void Cruises()
{
	Cruises.click();
}


@FindBy(linkText="Destinations")
WebElement Destinations;
public void Destinations()
{
	Destinations.click();
}

@FindBy(linkText="Vacations")
WebElement Vacations;
public void Vacations()
{
	Vacations.click();
}
}
