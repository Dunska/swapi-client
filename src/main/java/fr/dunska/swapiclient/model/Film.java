package fr.dunska.swapiclient.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Film implements Serializable
{

		public String title;

		@SerializedName("episode_id")
		public String episodeId;

		@SerializedName("opening_crawl")
		public String openingCrawl;

		public String director;
		public String producer;
		public String url;
		public String created;
		public String edited;

		@SerializedName("release_date")
		public String releaseDate;

		@SerializedName("species")
		public List<String> speciesUrls;

		@SerializedName("starships")
		public List<String> starshipsUrls;

		@SerializedName("vehicles")
		public List<String> vehiclesUrls;

		@SerializedName("planets")
		public List<String> planetsUrls;

		@SerializedName("characters")
		public List<String> charactersUrls;

}
