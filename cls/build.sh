#/bin/bash
lein uberjar
native-image \
  -jar target/uberjar/cls-0.1.0-SNAPSHOT-standalone.jar \
  -H:+ReportUnsupportedElementsAtRuntime \
  -J-Xmx3G \
  -J-Xms3G \
  --no-server \
  --no-fallback

