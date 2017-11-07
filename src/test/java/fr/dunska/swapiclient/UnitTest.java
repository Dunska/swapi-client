package fr.dunska.swapiclient;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import fr.dunska.swapiclient.api.Swapi;
import fr.dunska.swapiclient.model.People;
import fr.dunska.swapiclient.service.SwapiService;

@DisplayName("Unit Test presentation")
public class UnitTest
{


	static Swapi swapi;
	static SwapiService service;

	@BeforeAll
	public static void initSwapi()
	{
		swapi = Mockito.mock(Swapi.class);
		service = new SwapiService(swapi);
	}

	@Test
	@DisplayName("Basic")
	void myFirstTest()
	{
		assertEquals(2, 1 + 1);
	}

	@Test
	@DisplayName("uuu")
	void toto()
	{

		Mockito.when(swapi.people(Mockito.anyString())).thenReturn(new People("Toto"));

		System.out.println(service.getPeopleById("ttt").getName());
	}


}
