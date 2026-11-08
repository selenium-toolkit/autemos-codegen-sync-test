// @autemos workflow=5 generator=2
package com.example.tests;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.tests.pages.PlaygroundShopPage;

public class ShowcaseWebPlaygroundTestCartTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    @BeforeEach
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://autemos.selementrix.tech/demo/playground");
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void testShowcaseWebPlaygroundTestCart() throws Exception {
        // UNVOLLSTAENDIG: 1 Schritt(e) nicht generiert – siehe GENERATION_ERRORS.txt
        java.util.Map<String, Object> workflowVars = new java.util.LinkedHashMap<>();
        // @autemos node=node_22 type=webhookTrigger
        // webhookTrigger: Ausloeser – der Test startet ueber JUnit
        // @autemos end
        // @autemos node=node_1 type=openBrowser
        // Browser setup (handled by test framework)
        // @autemos end
        // @autemos node=node_nav type=navigate
        page.navigate("https://autemos.selementrix.tech/demo/playground");
        // @autemos end
        // @autemos node=node_2 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_01_Shop_Page_Loaded.png")));
        // @autemos end
        // @autemos node=node_3 type=type
        PlaygroundShopPage playgroundShopPage = new PlaygroundShopPage(page);
        playgroundShopPage.typeSearchInput("Headphones");
        // @autemos end
        // @autemos node=node_4 type=click
        playgroundShopPage.clickProductCardHeadphones();
        // @autemos end
        // @autemos node=node_5 type=click
        playgroundShopPage.clickQuantityIncrease();
        // @autemos end
        // @autemos node=node_easyTestData_1_1777190962331 type=easyTestData
        // NICHT GENERIERT — Knotenart 'easyTestData' (Test Data Easy) wird von der Code-Erzeugung nicht unterstuetzt (serverseitiger Dienst)
        // @autemos end
        // @autemos node=node_6 type=click
        playgroundShopPage.clickAddToCartBtn();
        // @autemos end
        // @autemos node=node_7 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_02_Headphones_Added.png")));
        // @autemos end
        // @autemos node=node_8 type=type
        playgroundShopPage.typeSearchInput(resolveWorkflowValue(workflowVars, "{{easyData.Column 1}}"));
        // @autemos end
        // @autemos node=node_9 type=click
        playgroundShopPage.clickProductCardTShirt();
        // @autemos end
        // @autemos node=node_10 type=click
        playgroundShopPage.clickAddToCartBtn();
        // @autemos end
        // @autemos node=node_11 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_03_T_Shirt_Added.png")));
        // @autemos end
        // @autemos node=node_12 type=click
        playgroundShopPage.clickCartIcon();
        // @autemos end
        // @autemos node=node_13 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_04_Cart_Contents.png")));
        // @autemos end
        // @autemos node=node_14 type=click
        playgroundShopPage.clickCheckoutBtn();
        // @autemos end
        // @autemos node=node_15 type=type
        playgroundShopPage.typeCheckoutName("Maria Schmidt");
        // @autemos end
        // @autemos node=node_16 type=type
        playgroundShopPage.typeCheckoutEmail("maria.schmidt@example.com");
        // @autemos end
        // @autemos node=node_17 type=type
        playgroundShopPage.typeCheckoutAddress("Bahnhofstrasse 42, 8001 Zurich");
        // @autemos end
        // @autemos node=node_18 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_05_Checkout_Form.png")));
        // @autemos end
        // @autemos node=node_wait_3_1791646877224 type=wait
        page.waitForTimeout(10000);
        // @autemos end
        // @autemos node=node_19 type=click
        playgroundShopPage.clickPlaceOrderBtn();
        // @autemos end
        // @autemos node=node_20 type=screenshot
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/Screenshot_06_Order_Success.png")));
        // @autemos end
        // @autemos node=node_21 type=closeBrowser
        // Browser teardown (handled by test framework)
        // @autemos end
    }

private String resolveWorkflowValue(java.util.Map<String, Object> vars, String raw) {
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\{\\{\\s*([^}]+?)\\s*\\}\\}").matcher(raw);
    StringBuffer buffer = new StringBuffer();
    boolean found = false;
    while (matcher.find()) {
        found = true;
        Object resolved = resolveWorkflowPath(vars, matcher.group(1).trim());
        matcher.appendReplacement(buffer, java.util.regex.Matcher.quoteReplacement(resolved != null ? String.valueOf(resolved) : matcher.group(0)));
    }
    if (!found) {
        return raw;
    }
    matcher.appendTail(buffer);
    return buffer.toString();
}

private Object resolveWorkflowPath(java.util.Map<String, Object> vars, String expression) {
    Object current = vars;
    for (String segment : expression.split("\\.")) {
        if (current instanceof java.util.Map<?, ?> map) {
            current = map.get(segment);
        } else if (current instanceof java.util.List<?> list) {
            try {
                current = list.get(Integer.parseInt(segment));
            } catch (Exception ex) {
                return null;
            }
        } else {
            return null;
        }
        if (current == null) {
            return null;
        }
    }
    return current;
}

private void acquireWorkflowTestData(java.util.Map<String, Object> vars, String sourceType, String dataType, int quantity, String scopeOverride, String ttlOverride, String storeAs, Long projectId) throws Exception {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.util.Map<String, Object> payload = new java.util.LinkedHashMap<>();
    payload.put("sourceType", sourceType);
    payload.put("dataType", dataType);
    payload.put("quantity", quantity);
    payload.put("scopeOverride", scopeOverride);
    payload.put("ttlOverride", ttlOverride);
    payload.put("bypassCache", false);
    payload.put("projectId", projectId);
    java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
            .uri(java.net.URI.create(System.getenv().getOrDefault("TEST_DATA_BASE_URL", "http://localhost:8080/api/testdata") + "/acquire"))
            .header("Content-Type", "application/json")
            .POST(java.net.http.HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(payload)))
            .build();
    java.net.http.HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new IllegalStateException("Test data acquire failed: HTTP " + response.statusCode());
    }
    java.util.Map<String, Object> data = mapper.readValue(response.body(), new com.fasterxml.jackson.core.type.TypeReference<java.util.Map<String, Object>>() {});
    vars.put(storeAs, data.get("tokenId"));
    vars.put(storeAs + "Token", java.util.Map.of(
            "tokenId", data.get("tokenId"),
            "scope", data.get("scope"),
            "acquiredAt", data.get("acquiredAt"),
            "expiresAt", data.get("expiresAt")));
    java.util.List<?> records = data.get("records") instanceof java.util.List<?> list ? list : java.util.List.of();
    vars.put(storeAs + "Record", !records.isEmpty() ? records.get(0) : java.util.Map.of());
    vars.put(storeAs + "Records", records);
}

private void releaseWorkflowTestData(java.util.Map<String, Object> vars, String tokenVariable) throws Exception {
    Object tokenContextRaw = vars.get(tokenVariable + "Token");
    java.util.Map<String, Object> tokenContext = new java.util.LinkedHashMap<>();
    if (tokenContextRaw instanceof java.util.Map<?, ?> rawContext) {
        for (java.util.Map.Entry<?, ?> contextEntry : rawContext.entrySet()) {
            tokenContext.put(String.valueOf(contextEntry.getKey()), contextEntry.getValue());
        }
    }
    Object tokenId = vars.getOrDefault(tokenVariable, tokenContext.get("tokenId"));
    if (tokenId == null) {
        return;
    }
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.util.Map<String, Object> payload = new java.util.LinkedHashMap<>();
    payload.put("tokenId", tokenId);
    payload.put("scope", tokenContext.getOrDefault("scope", "RUN"));
    payload.put("acquiredAt", tokenContext.get("acquiredAt"));
    payload.put("expiresAt", tokenContext.get("expiresAt"));
    java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
            .uri(java.net.URI.create(System.getenv().getOrDefault("TEST_DATA_BASE_URL", "http://localhost:8080/api/testdata") + "/release"))
            .header("Content-Type", "application/json")
            .POST(java.net.http.HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(payload)))
            .build();
    java.net.http.HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new IllegalStateException("Test data release failed: HTTP " + response.statusCode());
    }
}

private void persistWorkflowTestData(java.util.Map<String, Object> vars, String tokenVariable, String runId, String attemptId) throws Exception {
    Object tokenContextRaw = vars.get(tokenVariable + "Token");
    java.util.Map<String, Object> tokenContext = new java.util.LinkedHashMap<>();
    if (tokenContextRaw instanceof java.util.Map<?, ?> rawContext) {
        for (java.util.Map.Entry<?, ?> contextEntry : rawContext.entrySet()) {
            tokenContext.put(String.valueOf(contextEntry.getKey()), contextEntry.getValue());
        }
    }
    Object tokenId = vars.getOrDefault(tokenVariable, tokenContext.get("tokenId"));
    if (tokenId == null) {
        return;
    }
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.util.Map<String, Object> payload = new java.util.LinkedHashMap<>();
    payload.put("tokenId", tokenId);
    payload.put("scope", tokenContext.containsKey("scope") ? tokenContext.get("scope") : "RUN");
    payload.put("acquiredAt", tokenContext.get("acquiredAt"));
    payload.put("expiresAt", tokenContext.get("expiresAt"));
    payload.put("runId", runId);
    payload.put("attemptId", attemptId);
    java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
            .uri(java.net.URI.create(System.getenv().getOrDefault("TEST_DATA_BASE_URL", "http://localhost:8080/api/testdata") + "/persist"))
            .header("Content-Type", "application/json")
            .POST(java.net.http.HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(payload)))
            .build();
    java.net.http.HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new IllegalStateException("Test data persist failed: HTTP " + response.statusCode());
    }
}

private void resumeWorkflowTestData(java.util.Map<String, Object> vars, String runId, String attemptId, String storeAs) throws Exception {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    String baseUrl = System.getenv().getOrDefault("TEST_DATA_BASE_URL", "http://localhost:8080/api/testdata");
    String query = "runId=" + java.net.URLEncoder.encode(runId, java.nio.charset.StandardCharsets.UTF_8)
            + "&attemptId=" + java.net.URLEncoder.encode(attemptId, java.nio.charset.StandardCharsets.UTF_8);
    java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
            .uri(java.net.URI.create(baseUrl + "/resume?" + query))
            .GET()
            .build();
    java.net.http.HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new IllegalStateException("Test data resume failed: HTTP " + response.statusCode());
    }
    java.util.Map<String, Object> data = mapper.readValue(response.body(), new com.fasterxml.jackson.core.type.TypeReference<java.util.Map<String, Object>>() {});
    vars.put(storeAs, data.get("tokenId"));
    vars.put(storeAs + "Token", java.util.Map.of(
            "tokenId", data.get("tokenId"),
            "scope", data.get("scope"),
            "acquiredAt", data.get("acquiredAt"),
            "expiresAt", data.get("expiresAt")));
    java.util.List<?> records = data.get("records") instanceof java.util.List<?> list ? list : java.util.List.of();
    vars.put(storeAs + "Record", !records.isEmpty() ? records.get(0) : java.util.Map.of());
    vars.put(storeAs + "Records", records);
}
}