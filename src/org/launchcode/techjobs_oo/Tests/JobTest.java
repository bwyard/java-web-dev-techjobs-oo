package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job idJobOne;
    Job idJobTwo;
    Job jobTest;
    Job jobTestTwo;
    Job jobTestBlank;

    @Before
    public void createTwoJobObject(){
        idJobOne = new Job();
        idJobTwo = new Job();
        jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTestTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTestBlank = new Job("Product tester", new Employer(""), new Location("pop"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){

        assertEquals(1,idJobTwo.getId()-idJobOne.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){


        assertEquals( "Product tester",jobTest.getName());
        assertEquals( "ACME",jobTest.getEmployer().getValue());
        assertEquals("Desert",jobTest.getLocation().getValue());
        assertEquals( "Quality control",jobTest.getPositionType().getValue());
        assertEquals( "Persistence",jobTest.getCoreCompetency().getValue());
        assertTrue(jobTest instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(jobTest.equals(jobTestTwo));

    }
    @Test
    public void testBlankLineBeforeAndAfterToString(){
        assertTrue(jobTest.toString().startsWith("\n"));
        assertTrue(jobTest.toString().endsWith("\n"));
    }
    @Test
    public void testJobFields(){
        assertTrue(jobTest.toString().contains("\nID:"));
        assertTrue(jobTest.toString().contains("\nName:"));
        assertTrue(jobTest.toString().contains("\nEmployer:"));
        assertTrue(jobTest.toString().contains("\nLocation:"));
        assertTrue(jobTest.toString().contains("\nPosition Type:"));
        assertTrue(jobTest.toString().contains("\nCore Competency:"));
    }

    @Test
    public void testJobBlankField(){
        assertTrue(jobTestBlank.toString().contains("Data not available"));
    }

    @Test
    public void testOnlyIdExists(){
        assertEquals("OOPS! This job does not seem to exist.", idJobOne.toString());
    }




}
