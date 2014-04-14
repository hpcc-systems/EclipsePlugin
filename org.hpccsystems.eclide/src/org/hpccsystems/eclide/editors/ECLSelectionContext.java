package org.hpccsystems.eclide.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IHelpResource;
import org.eclipse.help.IIndex;
import org.eclipse.help.IIndexEntry;
import org.eclipse.help.ITopic;
import org.hpccsystems.eclide.resources.Messages;

public class ECLSelectionContext implements IContext {

	private String word = null;
	private IHelpResource[] fHelpResources;
	
	class ECLTopic implements IHelpResource {
		IIndexEntry[] entries; 
		String indexLabel;
		ITopic topic;

		public ECLTopic(String indexLabel, ITopic iTopic) {
			this.indexLabel = indexLabel;
			topic = iTopic;
		}

		@Override
		public String getHref() {
			return topic.getHref();
		}

		@Override
		public String getLabel() {
			String label = topic.getLabel();
			if (label == null || label.isEmpty()) {
				return indexLabel;
			}
			return label;
		}
	}

	public ECLSelectionContext(IContext context, String word) {
		word = word.toUpperCase();
		if (this.word == null || !this.word.equals(word)) {
			if (this.word == null) {
				this.word = new String();
			}
			this.word = word;

			List<IHelpResource> helpResources = new ArrayList<IHelpResource>();
			IIndex index = HelpSystem.getIndex();
			IIndexEntry[] entries = index.getEntries();
			for (int i = 0; i < entries.length; ++i) {
				if (entries[i].getKeyword().startsWith(word)) {
					ITopic[] topics = entries[i].getTopics();
					for (int j = 0; j < topics.length; ++j) {
						helpResources.add(new ECLTopic(entries[i].getKeyword(), topics[j]));
					}
				}
			}
	
			fHelpResources = helpResources.toArray(new IHelpResource[helpResources.size()]);
		}
	}

	@Override
	public IHelpResource[] getRelatedTopics() {
		return fHelpResources;
	}

	@Override
	public String getText() {
		return Messages.ECLSelectionContext_0;
	}
}
