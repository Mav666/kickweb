﻿$(document).ready(function() {
	$.get('categories', function(categories) {
		$('#categories').html('');
		for (var index in categories) {
			var category = categories[index];
			addCategory(category);
		} 
	});
	
	var skipLoad = false;
	
	var setHash = function(hash) {
		skipLoad = true;
		window.location.hash = hash;
	}
	
	var getHash = function() {
		return window.location.hash;
	}
	
	var loadHash = function(hash) {
		var regexp = /^#categories\/([0-9]+)$/;
		if (regexp.test(hash)) {
			var result = regexp.exec(hash);
			var categoryId = result[1];
			loadCategoryProjects(categoryId);
		} 
		
		regexp = /^#categories\/([0-9]+)\/projects\/([0-9]+)$/;
		if (regexp.test(hash)) {
			var result = regexp.exec(hash);
			var categoryId = result[1];
			var projectId = result[2];
			loadCategoryProjects(categoryId, function() {
				loadProject(projectId);
			});
			
		}
	}
	
	var addCategory = function(category) {
		var categoryContainerId = 'category_' + category.index;
		$('#categories').append('<div id="' + categoryContainerId + '">' + category.name + '</div>');
		
		$('#' + categoryContainerId).click(function() {	
			setHash('#categories/' + category.index);
			
			loadCategoryProjects(category.index);
		});
	}
	
	var loadCategoryProjects = function(categoryId, onLoad) {
		$.get('categories/' + categoryId + '/projects', function(projects) {
			$('#projects').html('');
			$('#project').html('');
			for (var index in projects) {
				var project = projects[index];
				addProject(categoryId, project);
			}
			if (!!onLoad) {
				onLoad();
			}
		});
	}
	
	var addProject = function(categoryId, project) {
		var projectContainerId = 'project_' + project.id;
		$('#projects').append(' <div id="' + projectContainerId + '">' + project.title + '</div>');
		
		$('#' + projectContainerId).click(function() {	
			setHash('#categories/' + categoryId + '/projects/' + project.id);
			
			loadProject(project.id);
		});
	}
	
	var loadProject = function(projectId) {
		$.get('projects/' + projectId, function(project) {
			$('#project').html(' <br> <div>name: ' + project.title + '</div>' + 
					'<div>description: ' + project.description + '</div>');
		});
	}
	
	loadHash(getHash());
	
	window.onhashchange = function () {
		if (!skipLoad) {
			loadHash(getHash());
		}
		skipLoad = false;
	};
});