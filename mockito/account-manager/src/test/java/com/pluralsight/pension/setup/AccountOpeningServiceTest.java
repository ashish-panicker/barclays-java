package com.pluralsight.pension.setup;


import java.io.IOException;
import java.time.LocalDate;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountOpeningServiceTest {

    private AccountOpeningService underTest;
    private BackgroundCheckService backgroundCheckService = null;
    private ReferenceIdsManager referenceIdsManager = null;
    private AccountRepository accountRepository = null;

    
    void setUp() {
        underTest = new AccountOpeningService(backgroundCheckService, referenceIdsManager, accountRepository);
    }

    @Test
    public void shouldOpenAccount() throws IOException {
        final AccountOpeningStatus accountOpeningStatus = underTest.openAccount("John", "Smith", "123XYZ9",
                LocalDate.of(1990, 1, 1));
        // assertEquals(AccountOpeningStatus.OPENED, accountOpeningStatus);

    }
}