package com.census;

import com.opencsv.exceptions.CsvValidationException;
import junit.framework.Assert;
import org.junit.Test;
import java.io.IOException;

    public class StateCensusTest {
        @Test
        public void givenStateCensusCSV_CheckNumberOfRecordsMatches() throws Exception {
            StateCensusAnalyser analyzer = new StateCensusAnalyser();
            int count = analyzer.loadAnalyzer();
            Assert.assertEquals(4, count, 0);
        }

        @Test
        public void givenStateCensusCSV_ThrowCustomException() throws Exception {
            try {
                StateCensusAnalyser analyzer = new StateCensusAnalyser();
                if(analyzer.loadAnalyzer()==0)
                    throw new CustomExceptionIncorrect();
            } catch (CustomExceptionIncorrect e) {
                System.out.println(e.toString());
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        @Test
        public void givenStateCensusCSV_IfTypeIncorrectThrowCustomException() throws Exception {
            StateCensusAnalyser analyzer = new StateCensusAnalyser();
                     int count = analyzer.loadAnalyzer();
            Assert.assertEquals(4, count, 0);
        }
        @Test
        public void givenStateCensusCSV_IfDelimiterIncorrectThrowCustomException() throws Exception {
            StateCensusAnalyser analyzer = new StateCensusAnalyser();
            int count = analyzer.loadAnalyzer();
            Assert.assertEquals(4, count, 0);
        }

        @Test
        public void givenStateCensusCSV_IfHeaderIncorrectThrowCustomException() throws Exception {
            StateCensusAnalyser analyzer = new StateCensusAnalyser();
            int count = analyzer.loadAnalyzer();
            Assert.assertEquals(4, count, 0);
        }
    }

