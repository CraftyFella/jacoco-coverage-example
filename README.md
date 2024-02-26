## Coverage Example using jacoco Aggregation plugin

### Generate the coverage html report

```bash
./gradlew clean :testCodeCoverageReport
```

should generate a report at

```text
.
└── build
    └── reports
        └── jacoco
            └── testCodeCoverageReport
                └── html
                    └── index.html
```

### Run tests no report

```bash
./gradlew clean test
```