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
mvn spring-boot:run
```

## Troubleshooting

If you run into any issues not listed here, please [open a ticket](https://github.com/orca-scan/orca-lookup-java/issues).

## Contributing

To contribute simply:

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request

## History

For change-log, check [releases](https://github.com/orca-scan/orca-lookup-java/releases).

## License

Licensed under [MIT License](LICENSE) &copy; [Orca Scan](https://orcascan.com)
