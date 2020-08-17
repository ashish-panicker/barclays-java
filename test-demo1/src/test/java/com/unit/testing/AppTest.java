package com.unit.testing;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.unit.testing.mocks.DatabaseDAO;
import com.unit.testing.mocks.NetworkDao;
import com.unit.testing.mocks.RecordService;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Unit test for simple App.
 */

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @InjectMocks
    private RecordService rs;

    @Mock
    private DatabaseDAO database;
    
    @Mock
    private NetworkDao network;

    @Test
    public void testSaveMethod() {

        boolean isSaved = rs.save("data.file");
        assertTrue(isSaved);

        verify(database, times(1)).save("data.file");

        verify(network, times(1)).save("data.file");

    }

}
