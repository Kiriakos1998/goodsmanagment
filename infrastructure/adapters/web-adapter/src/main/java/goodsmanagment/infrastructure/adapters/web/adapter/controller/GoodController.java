package goodsmanagment.infrastructure.adapters.web.adapter.controller;

import goodsmanagment.infrastructure.adapters.web.adapter.model.GoodResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("goods")
public class GoodController {

  @PostMapping
  public ResponseEntity<GoodResource> addGood(@RequestBody GoodResource resource) {
    return ResponseEntity.ok(new GoodResource());
  }

  @GetMapping("/{id}")
  public ResponseEntity<GoodResource> getGood(@PathVariable String id) {
    return ResponseEntity.ok(new GoodResource());
  }

  @DeleteMapping
  public ResponseEntity<Void> removeGood(@RequestBody GoodResource resource) {
    return ResponseEntity.noContent().build();
  }
}
