# SolrAbstraction

By Mihir M Mirajkar   

email: mmmirajk@ncsu.edu / mihirmirajkar@gmail.com


## Requirements for the project:
1. The solr server should be started using: 
```bash 
bin/solr -e techproducts
```

This can be edited very easily in a string in SolrUtils class and can be used for any core or exampple.

2. Use the war file provided(Solr_Abstraction.war) to upload on the clients server.
3. Using the war uploaded, a query can be sent using the following URL:

```
http://localhost:{port_Number}/SpringMVC/decisioncontroller/getquery/{query}
```

where use your desired query instead of {query} and port of server on which the war file is uploaded.

4. For Example my port number was 8080 and I queried 'a' my url would be 
```
http://localhost:8080/SpringMVC/decisioncontroller/getquery/a
```

5. This returns a json response which can be manipulated the way you want.
The response to my query was:
```json
[
  {
    "id":"VDBDB1A16",
    "name":"A-DATA V-Series 1GB 184-Pin DDR SDRAM Unbuffered DDR 400 (PC 3200) System Memory - OEM",
    "manu":"A-DATA Technology Inc.",
    "manu_id_s":"corsair",
    "cat":[
      "electronics",
      "memory"],
    "features":["CAS latency 3,   2.7v"],
    "popularity":0,
    "inStock":true,
    "store":"45.18414,-93.88141",
    "manufacturedate_dt":"[\n  {\n    \"id\":\"VDBDB1A16\",\n    \"name\":\"A-DATA V-Series 1GB 184-Pin DDR SDRAM Unbuffered DDR 400 (PC 3200) System Memory - OEM\",\n    \"manu\":\"A-DATA Technology Inc.\",\n    \"manu_id_s\":\"corsair\",\n    \"cat\":[\n      \"electronics\",\n      \"memory\"],\n    \"features\":[\"CAS latency 3,   2.7v\"],\n    \"popularity\":0,\n    \"inStock\":true,\n    \"store\":\"45.18414,-93.88141\",\n    \"manufacturedate_dt\":",
    "manufacturedate_pdt":"[\n  {\n    \"id\":\"VDBDB1A16\",\n    \"name\":\"A-DATA V-Series 1GB 184-Pin DDR SDRAM Unbuffered DDR 400 (PC 3200) System Memory - OEM\",\n    \"manu\":\"A-DATA Technology Inc.\",\n    \"manu_id_s\":\"corsair\",\n    \"cat\":[\n      \"electronics\",\n      \"memory\"],\n    \"features\":[\"CAS latency 3,   2.7v\"],\n    \"popularity\":0,\n    \"inStock\":true,\n    \"store\":\"45.18414,-93.88141\",\n    \"manufacturedate_dt\":\"[\\n  {\\n    \\\"id\\\":\\\"VDBDB1A16\\\",\\n    \\\"name\\\":\\\"A-DATA V-Series 1GB 184-Pin DDR SDRAM Unbuffered DDR 400 (PC 3200) System Memory - OEM\\\",\\n    \\\"manu\\\":\\\"A-DATA Technology Inc.\\\",\\n    \\\"manu_id_s\\\":\\\"corsair\\\",\\n    \\\"cat\\\":[\\n      \\\"electronics\\\",\\n      \\\"memory\\\"],\\n    \\\"features\\\":[\\\"CAS latency 3,   2.7v\\\"],\\n    \\\"popularity\\\":0,\\n    \\\"inStock\\\":true,\\n    \\\"store\\\":\\\"45.18414,-93.88141\\\",\\n    \\\"manufacturedate_dt\\\":\",\n    \"manufacturedate_pdt\":",
    "payloads":"electronics|0.9 memory|0.1",
    "_version_":1566406649330008064},
  {
    "id":"GB18030TEST",
    "name":"Test with some GB18030 encoded characters",
    "features":[
      "No accents here",
      "??????",
      "This is a feature (translated)",
      "?????????",
      "This document is very shiny (translated)"],
    "price":0.0,
    "price_c":"0.0,USD",
    "inStock":true,
    "_version_":1566406649116098560},
  {
    "id":"UTF8TEST",
    "name":"Test with some UTF-8 encoded characters",
    "manu":"Apache Software Foundation",
    "cat":[
      "software",
      "search"],
    "features":[
      "No accents here",
      "This is an e acute: é",
      "eaiou with circumflexes: êâîôû",
      "eaiou with umlauts: ëäïöü",
      "tag with escaped chars: <nicetag/>",
      "escaped ampersand: Bonnie & Clyde",
      "Outside the BMP:? codepoint=10308, a circle with an x inside. UTF8=f0908c88 UTF16=d800 df08"],
    "price":0.0,
    "price_c":"0.0,USD",
    "inStock":true,
    "_version_":1566406649395019776}]
   ```


