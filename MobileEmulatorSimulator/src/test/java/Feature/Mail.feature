@Mail
Feature: Mail.
   Scenario: Android App
     * Get "Pixel 3 API 30" "emulator-5554" capabilities from resource and lunch app
     * Send Mail from sender to receiver specific subject with content
     * Click options
     * Click send
     * Click last received mail
     * Verify mail is send
     * Close app
     * Get "Pixel 4 API 30" "emulator-5556" capabilities from resource and lunch app
     * Click last received mail
     * Verify element come from sender user
     * Send Mail from receiver to sender subject with content
     * Close app
     * Get "Pixel 3 API 30" "emulator-5554" capabilities from resource and lunch app
     * Click last received mail
     * Verify element come from receiver user
     * Close app
