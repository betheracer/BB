import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by devin on 2022-05-26.
 */


class AccountRepository {
    public AccountRepository() {
    }
}

class AccountService {

    @Injectt
    AccountRepository accountRepository;

    public AccountService() {
    }
}





public class IOC {

    @Test
    public void IoC_컨테이너(){
        AccountService accountService = ContainerService.getObject(AccountService.class);
        assertNotNull(accountService);
        assertNotNull(accountService.accountRepository);
    }
}
