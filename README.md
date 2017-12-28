# PayVisionClient
Refer the section Direct Post API (https://secure.networkmerchants.com/gw/merchants/resources/integration/integration_portal.php#integration_overview
) for more details on the client methods implemented in the project.

In order to run the integration test you may use the following command
./mvnw -Dtest=PayvisionClientTest  test

Note: Please refer CONFIG_LOCATIONS in TestConfig.java for the possible locations of 
the payvision-client.properties searched by the integration test.

A sample of the values in the payvision-client.properties is as follows:
username = demo
password = password
