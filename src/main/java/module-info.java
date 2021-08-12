module cloud.tavitian.provenance {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;
  requires org.apache.httpcomponents.httpclient.fluent;
  requires com.fasterxml.jackson.databind;
  opens cloud.tavitian.provenance to javafx.fxml;
  opens cloud.tavitian.provenance.controllers to javafx.fxml;
  exports cloud.tavitian.provenance;
  exports cloud.tavitian.provenance.controllers;
}