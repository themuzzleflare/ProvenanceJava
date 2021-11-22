// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

import java.io.IOException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Content;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

public class APIFacade {
  private static final String apiKey = "";

  public static TransactionResource[] listTransactions() throws IOException {
    Request request = Request.Get("https://api.up.com.au/api/v1/transactions?page[size]=100")
        .addHeader("Accept", "application/json")
        .addHeader("Authorization", "Bearer " + apiKey);

    Content response = request.execute().returnContent();
    String json = response.asString();

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    return objectMapper.readValue(json, TransactionsResponse.class).getData();
  }

  public static AccountResource[] listAccounts() throws IOException {
    Request request = Request.Get("https://api.up.com.au/api/v1/accounts?page[size]=100")
        .addHeader("Accept", "application/json")
        .addHeader("Authorization", "Bearer " + apiKey);

    Content response = request.execute().returnContent();
    String json = response.asString();

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    return objectMapper.readValue(json, AccountsResponse.class).getData();
  }

  public static TagResource[] listTags() throws IOException {
    Request request = Request.Get("https://api.up.com.au/api/v1/tags?page[size]=100")
        .addHeader("Accept", "application/json")
        .addHeader("Authorization", "Bearer " + apiKey);

    Content response = request.execute().returnContent();
    String json = response.asString();

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    return objectMapper.readValue(json, TagsResponse.class).getData();
  }

  public static CategoryResource[] listCategories() throws IOException {
    Request request = Request.Get("https://api.up.com.au/api/v1/categories")
        .addHeader("Accept", "application/json")
        .addHeader("Authorization", "Bearer " + apiKey);

    Content response = request.execute().returnContent();
    String json = response.asString();

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    return objectMapper.readValue(json, CategoriesResponse.class).getData();
  }
}