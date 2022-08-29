package com.quocdung.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.quocdung.dto.SearchCriteria;
import com.quocdung.entity.Product;
import com.quocdung.enums.SearchOperation;

public class ProductSpecificationBuilder {
	private List<SearchCriteria> params;

	public ProductSpecificationBuilder() {
		super();
		this.params = new ArrayList<SearchCriteria>();
	}

	public final ProductSpecificationBuilder with(String key, String operation, Object value) {
		params.add(new SearchCriteria(key, value, operation));
		return this;
	}

	public final ProductSpecificationBuilder with(SearchCriteria searchCriteria) {
		params.add(searchCriteria);
		return this;
	}

	public Specification<Product> build() {
		if (params.size() == 0) {
			return null;
		}
		Specification<Product> result = createProductSpecification(params.get(0));
		for (int idx = 1; idx < params.size(); idx++) {
			SearchCriteria criteria = params.get(idx);
			Specification<Product> specification = createProductSpecification(params.get(idx));
			result = SearchOperation.getDataOption(criteria.getDataOption()) == SearchOperation.ALL
					? Specification.where(result).and(specification)
					: Specification.where(result).or(specification);
		}
		return result;
	}

	public Specification<Product> createProductSpecification(SearchCriteria searchCriteria) {
		Specification<Product> result;
		String strToSearch = searchCriteria.getValue().toString();
		if (strToSearch.contains(",")) {
			String[] searchValues = strToSearch.split(",");
			result = Specification.where(new ProductSpecification(
					new SearchCriteria(searchCriteria.getFilterKey(), searchValues[0], searchCriteria.getOperation())));
			int i = 1;
			while (i < searchValues.length) {
				result = result.or(new ProductSpecification(new SearchCriteria(searchCriteria.getFilterKey(),
						searchValues[i], searchCriteria.getOperation())));
				i++;
			}
		} else {
			result = new ProductSpecification(searchCriteria);
		}
		return result;
	}
}
