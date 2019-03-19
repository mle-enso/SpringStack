package kb.SpringWebKB;

import static org.junit.Assert.assertNotNull;

import org.elasticsearch.common.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

    @Autowired
    private JedisConnectionFactory factory;

    @Test
    public void testApp() {
        assertNotNull(factory);
    }
}
