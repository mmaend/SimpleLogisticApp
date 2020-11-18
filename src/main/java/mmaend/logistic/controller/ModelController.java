package mmaend.logistic.controller;

import mmaend.logistic.domain.Model;
import mmaend.logistic.repo.ModelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo> {
    public ModelController(ModelRepo repo) {
        super(repo);
    }
}