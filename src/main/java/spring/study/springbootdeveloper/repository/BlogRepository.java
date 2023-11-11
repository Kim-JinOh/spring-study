package spring.study.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.study.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
