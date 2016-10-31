package com.dicedmelon.gradle.jacoco.android

public class ReportConfiguration {

  private boolean enabled
  private File destination

  ReportConfiguration(boolean enabled) {
    this.enabled = enabled
  }

  public boolean isEnabled() {
    enabled
  }

  public void enabled(boolean enabled) {
    this.enabled = enabled
  }

  File getDestination() {
    return destination
  }

  void setDestination(File destination) {
    this.destination = destination
  }
}
