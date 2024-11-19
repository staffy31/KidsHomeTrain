module staffy.kidshometrain {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires validatorfx;
  requires org.kordamp.bootstrapfx.core;

  opens staffy.kidshometrain to javafx.fxml;
  exports staffy.kidshometrain;
}
