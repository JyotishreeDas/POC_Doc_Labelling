package com.poc.Documentlabelling.DAO;

import java.util.List;
import com.poc.Documentlabelling.entity.Document;


public interface DocumentDao {

  List<Document> getAllDocuments();
  
  
}
