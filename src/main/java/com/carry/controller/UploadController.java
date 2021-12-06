package com.carry.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping("/index")
	public String toUpload() {
		return "upload";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(MultipartFile file, HttpServletRequest request) {
		try {
			String dir = request.getServletContext().getRealPath("/upload");
			File fileDir = new File(dir);
			if(!fileDir.exists())
				fileDir.mkdirs();
			String fileSuffix=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			String fileName=UUID.randomUUID().toString()+fileSuffix;
			File files = new File(fileDir+"/"+fileName);
			file.transferTo(files);
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail";
		}
		return "Success";
	}
}
