package de.be.aff.springrestdocs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrint;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static de.be.aff.springrestdocs.DocumentationConfig.API_HOST;
import static de.be.aff.springrestdocs.DocumentationConfig.GENERATED_SNIPPETS_DIR;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureRestDocs(value = GENERATED_SNIPPETS_DIR, uriHost = API_HOST, uriPort = 80)
@AutoConfigureMockMvc(print = MockMvcPrint.NONE)
@SpringBootTest
public class QuoteControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getQuote() throws Exception {


        mockMvc.perform(get("/quote"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));

        mockMvc.perform(get("/quote"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));

    }

    @Test
    public void thatUrlDoesntExist() throws Exception {


        mockMvc.perform(get("/quotes"))
                .andExpect(status().isNotFound());

    }
}