# orca-lookup-java

This open source project is a an example of [how to scan barcodes using a smartphone](https://orcascan.com/mobile) and [present data from your system](https://orcascan.com/docs/api/lookup-url) using [Java](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot) and the [spring](https://spring.io/) framework.

**How it works:**

1. A user [scans a barcode](https://orcascan.com/mobile) using their smartphone
2. Orca Scan sends a HTTP GET request to your endpoint with `?barcode=value`
3. Your system queries a database or internal API for a `barcode` match
4. Your system returns the data in JSON format with keys matching column names
5. The [Orca Scan mobile](https://orcascan.com/mobile) app presents that data to the user

*If the mobile user has [update permission](https://orcascan.com/docs/getting-started/adding-users#selecting-user-permissions) and saves the data, it will saved to your Orca sheet.*

## Install

First ensure you have [Java](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot) installed:

```bash
# should return 1.7 or higher
java -version
```

Then execute the following:

```bash
# download this example code
git clone https://github.com/orca-scan/orca-lookup-java.git

# go into the new directory
cd orca-lookup-java

# install dependencies
mvn install
```

## Run

```bash
mvn spring-boot:run -Dserver.port=5000
```

Visit [http://localhost:5000?barcode=4S3BMHB68B3286050](http://localhost:5000?barcode=4S3BMHB68B3286050) to see the following:

```json
{
    "VIN": "4S3BMHB68B3286050",
    "Make": "SUBARU",
    "Model": "Legacy",
    "Manufacturer Name": "FUJI HEAVY INDUSTRIES U.S.A",
    "Vehicle Type": "PASSENGER CAR",
    "Year": 1992
}
```

## How this example works

```java
@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
@ResponseBody
public HashMap<String, Object> Lookup(String barcode) {

    // TODO: query a database or API to retrieve some data based on barcode value

    // return data as JSON object (property names must match Orca column names)
    HashMap<String, Object> data = new HashMap<>();
    data.put("VIN", barcode);
    data.put("Make", "SUBARU");
    data.put("Model", "Legacy");
    data.put("Manufacturer Name", "FUJI HEAVY INDUSTRIES U.S.A");
    data.put("Vehicle Type", "PASSENGER CAR");
    data.put("Year", 1992);

    return data;
}
```

## Troubleshooting

If you run into any issues not listed here, please [open a ticket](https://github.com/orca-scan/orca-lookup-java/issues).


## Examples in other langauges
* [orca-lookup-node](https://github.com/orca-scan/orca-lookup-node)
* [orca-lookup-dotnet](https://github.com/orca-scan/orca-lookup-dotnet)
* [orca-lookup-go](https://github.com/orca-scan/orca-lookup-go)
* [orca-lookup-python](https://github.com/orca-scan/orca-lookup-python)
* [orca-lookup-php](https://github.com/orca-scan/orca-lookup-php)

## History

For change-log, check [releases](https://github.com/orca-scan/orca-lookup-java/releases).

## License

Licensed under [MIT License](LICENSE) &copy; Orca Scan, the [Barcode Scanner app for iOS and Android](https://orcascan.com).
