## Coverage Example using jacoco Aggregation plugin


### Generate the coverage html report

```bash
./gradlew application:testCodeCoverageReport
```

should generate a report at

```text
.
└── application
    └── build
        └── reports
            └── jacoco
                └── testCodeCoverageReport
                    └── html
                        └── index.html
```

### Run tests no report

```bash
./gradlew application:test
```